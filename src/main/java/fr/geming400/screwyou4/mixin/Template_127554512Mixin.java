package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceSelectorArgument.Info.Template.class)
public class Template_127554512Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type__876543758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-876543758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceSelectorArgument;", cancellable = true)
    private void instantiate_2004049321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004049321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate_630125558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630125558L))
            info.setReturnValue(null);
    }


}
