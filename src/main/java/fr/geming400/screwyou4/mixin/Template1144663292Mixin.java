package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceKeyArgument.Info.Template.class)
public class Template1144663292Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type_106413849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(106413849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceKeyArgument;", cancellable = true)
    private void instantiate_22952082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(22952082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate__661659699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-661659699L))
            info.setReturnValue(null);
    }


}
