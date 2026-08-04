package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.TimeArgument.Info.Template.class)
public class Template_843840784Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type__194408660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-194408660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/TimeArgument;", cancellable = true)
    private void instantiate__1631915309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1631915309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate__962482208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962482208L))
            info.setReturnValue(null);
    }


}
