package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrTagArgument.Info.Template.class)
public class Template1289955284Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type_251705841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(251705841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceOrTagArgument;", cancellable = true)
    private void instantiate__20386350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-20386350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate__516367707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-516367707L))
            info.setReturnValue(null);
    }


}
