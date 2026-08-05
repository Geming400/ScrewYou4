package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapBanner.class)
public class MapBanner2097523850Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/util/Optional;", cancellable = true)
    private void name__1951982024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1951982024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__811931187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811931187L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_962063875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962063875L))
            info.setReturnValue("5]\uBFFAV*Yaa:U\u75CA.osc{\u5119a59)r\u29C2`>\u1D28w,\u9DC4Z\u94EB#a02bUle\u214B_S7;cY6Oe]N\u226DDx\u3601k$Y\u6318M\u2BD4k+\uA41D.\u2083yBwk\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2135786592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2135786592L))
            info.setReturnValue(721103962);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId_962063379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962063379L))
            info.setReturnValue("hCb 3\u365334E7QA\u539A\u624Bu\uD0F5Gl\u05D4V\u8715 r t0#\u79CB}Ybwn8\u3310-#'Jgt)V\u54F3B)D8!\uB5CE\u401B\uCD78\u364BWu\u4453|<hL8;$P\u9BBAc*p{jZIS]AB\"cs");
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos_204136971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(204136971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void color__762135216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762135216L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.LIGHT_GRAY);
    }

    @Inject(at = @At("HEAD"), method = "getDecoration()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getDecoration__648567674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648567674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromWorld(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/saveddata/maps/MapBanner;", cancellable = true)
    private static void fromWorld__1861226227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861226227L))
            info.setReturnValue(null);
    }


}
