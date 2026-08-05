package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.EntityArgument.Info.Template.class)
public class Template1980579590Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type_976481321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(976481321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/EntityArgument;", cancellable = true)
    private void instantiate_1115566858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115566858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate__1811816659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811816659L))
            info.setReturnValue(null);
    }


}
