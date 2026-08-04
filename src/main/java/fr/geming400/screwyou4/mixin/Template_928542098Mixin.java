package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.SingletonArgumentInfo.Template.class)
public class Template_928542098Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type__109707346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109707346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate__877909854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877909854L))
            info.setReturnValue(null);
    }


}
