package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.Damage.class)
public class Damage_265370233Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__1223427008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1223427008L))
            info.setReturnValue(2.810194E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1129880422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1129880422L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__643256036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-643256036L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1035793757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1035793757L))
            info.setReturnValue("D$_oE'Qlv+R8J(\u1944\u9BEF=]\u24FC\u5722=kojs+\u7F1FGc\u8C6E\u4D31&A\u80F9\u0474\u8222uci:>J\uC21Dq,7\u720FwQ\u1B61+|95RP9*`p|R9x");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_822722323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822722323L))
            info.setReturnValue(860814142);
    }

    @Inject(at = @At("HEAD"), method = "normalize()Z", cancellable = true)
    private void normalize__154054334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-154054334L))
            info.setReturnValue(true);
    }


}
