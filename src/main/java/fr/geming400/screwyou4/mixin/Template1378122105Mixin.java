package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrTagKeyArgument.Info.Template.class)
public class Template1378122105Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type_339872662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339872662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument;", cancellable = true)
    private void instantiate__503581548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503581548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate__428200886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-428200886L))
            info.setReturnValue(null);
    }


}
