package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.HolderSet.Named.class)
public class Named_1393654011Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2130890257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2130890257L))
            info.setReturnValue("SBOZv}Z\uB495r+!W(g}<?\u8D73yx\u8A68\uBFFE3yXP'kg>r\uF989VQ:u\"{\u59BEXX7Obox`<P7=tX\"\uCFC1P>v<],G^FCc(=u7cl\u325C.y+\u3C0D)tohA$");
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void contains_1194596511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1194596511L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void key_382015832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382015832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void unwrap_863478862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863478862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBound()Z", cancellable = true)
    private void isBound__2079747907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2079747907L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canSerializeIn(Lnet/minecraft/core/HolderOwner;)Z", cancellable = true)
    private void canSerializeIn__1128623680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1128623680L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "unwrapKey()Ljava/util/Optional;", cancellable = true)
    private void unwrapKey_1915466660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915466660L))
            info.setReturnValue(null);
    }


}
