package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.SingletonArgumentInfo.Template.class)
public class Template_928542098Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type__75556172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75556172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate_1430984184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430984184L))
            info.setReturnValue(null);
    }


}
