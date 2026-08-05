package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BannerPattern.class)
public class BannerPattern_500565082Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__408061187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-408061187L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1270988606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270988606L))
            info.setReturnValue("Dxp'Im&D\uD321C3:;T\u5058Oa3'6R1EqY^9rb4e`{<&*j=oG\u1B12}z=%\uB97CM jsbZ@b])Z&\u75B3oYD5G=)6K+><w\u8DA1H|T");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1057917172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1057917172L))
            info.setReturnValue(1035624638);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void assetId__1446709045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1446709045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translationKey()Ljava/lang/String;", cancellable = true)
    private void translationKey_738879312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(738879312L))
            info.setReturnValue("NVt.d\uC568r9I\"XQ,&O\u5FFB(uW\u11ED\uA2BA\uFE29w_&^\u82F7Tb(B4\u1D03AU^<{;\u92335|:g_ab\u36BC.y99\u428A5t:%R{\u312FP!yV");
    }


}
