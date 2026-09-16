package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.SpriteMapper.class)
public class SpriteMapper1664471996Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_755845728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755845728L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1860071775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860071775L))
            info.setReturnValue("lKF^7A\u8F25`}YW.N\u84EEL\uD5D5DD!M\u5E76d#6zc%g\u32D8whqi7n&IJOgnT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2073143209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073143209L))
            info.setReturnValue(-1947495093);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private void apply__1880535322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880535322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prefix()Ljava/lang/String;", cancellable = true)
    private void prefix__1963676585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1963676585L))
            info.setReturnValue("%LchOc&@^a6n[wCIy\u6F5FuH6r6&IFcUjs|2-}^W\u1D69SK");
    }

    @Inject(at = @At("HEAD"), method = "defaultNamespaceApply(Ljava/lang/String;)Lnet/minecraft/client/resources/model/sprite/SpriteId;", cancellable = true)
    private void defaultNamespaceApply__656905430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-656905430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sheet()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void sheet__1909724830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1909724830L))
            info.setReturnValue(null);
    }


}
