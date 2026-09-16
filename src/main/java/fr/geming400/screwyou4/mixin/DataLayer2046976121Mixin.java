package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.DataLayer.class)
public class DataLayer2046976121Mixin {
        @Inject(at = @At("HEAD"), method = "get(III)I", cancellable = true)
    private void get__1014840050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1014840050L))
            info.setReturnValue(435238244);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1477568146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1477568146L))
            info.setReturnValue("Vjxb|7i'n?*!p31tDH.\u0A1F\uF94A\u2785)6(r\u2AA0(];r\uD18CQ}*\u5672<\u7C25#2 >*@Ii\u8A4C_|d");
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/DataLayer;", cancellable = true)
    private void copy__207913537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207913537L))
            info.setReturnValue(new net.minecraft.world.level.chunk.DataLayer());
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1188874803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1188874803L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fill(I)V", cancellable = true)
    private void fill_198299368(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(198299368L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(IIII)V", cancellable = true)
    private void set__1098231990(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1098231990L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getData()[B", cancellable = true)
    private void getData_1725204255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1725204255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDefinitelyHomogenous()Z", cancellable = true)
    private void isDefinitelyHomogenous__69178365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-69178365L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isDefinitelyFilledWith(I)Z", cancellable = true)
    private void isDefinitelyFilledWith__342521128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342521128L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "layerToString(I)Ljava/lang/String;", cancellable = true)
    private void layerToString_2084048172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084048172L))
            info.setReturnValue("\uA78E`Y<2(MOqa\u8A1C\uC294JRv:&Y;`'RL\uC8E1E8duH]dMR\u861F\uA75D>Zo\u32C2}STHhAJ(<nBe\u2001{ssunuiJ y\"P}Gq\u2DDBkKtY!aN&:c\u0F56Ul");
    }


}
