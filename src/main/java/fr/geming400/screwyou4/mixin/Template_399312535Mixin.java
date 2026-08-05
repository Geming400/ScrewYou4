package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ScoreHolderArgument.Info.Template.class)
public class Template_399312535Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type__604785735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-604785735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ScoreHolderArgument;", cancellable = true)
    private void instantiate__555004919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555004919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate_901883581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901883581L))
            info.setReturnValue(null);
    }


}
