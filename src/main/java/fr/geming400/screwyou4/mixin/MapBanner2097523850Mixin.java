package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapBanner.class)
public class MapBanner2097523850Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/util/Optional;", cancellable = true)
    private void name__1379506237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379506237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1188897582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1188897582L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1427019921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427019921L))
            info.setReturnValue("RXTpV\u5495G]x`' _\u9705,jg{sUFt\u0852&9OtL3N\"(!D'_!l+&tA;1.<=xS");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1640091355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1640091355L))
            info.setReturnValue(-1355987264);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId__1050151836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1050151836L))
            info.setReturnValue("?]g\u8301\u6A02`7\uD6E2!aj`Jfk%xs&va(D\uAD0AQ_+m\uCB39\u827C_w\u24628RN|4]uwX!/[9>\uC0668AAIEK#*b\uA2D9K=");
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__183252425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-183252425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "color()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void color_2128139405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128139405L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.WHITE);
    }

    @Inject(at = @At("HEAD"), method = "fromWorld(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/saveddata/maps/MapBanner;", cancellable = true)
    private static void fromWorld_812385045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(812385045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDecoration()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getDecoration_1222942496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1222942496L))
            info.setReturnValue(null);
    }


}
