package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceArgument.Info.Template.class)
public class Template1064753969Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type_60655700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(60655700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceArgument;", cancellable = true)
    private void instantiate_1802006378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1802006378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate_1567325016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1567325016L))
            info.setReturnValue(null);
    }


}
