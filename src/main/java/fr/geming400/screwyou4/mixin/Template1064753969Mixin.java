package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceArgument.Info.Template.class)
public class Template1064753969Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type_26504526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(26504526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceArgument;", cancellable = true)
    private void instantiate_639064724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(639064724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate__741569022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-741569022L))
            info.setReturnValue(null);
    }


}
