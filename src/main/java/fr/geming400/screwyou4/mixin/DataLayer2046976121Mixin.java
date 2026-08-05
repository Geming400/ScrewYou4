package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.DataLayer.class)
public class DataLayer2046976121Mixin {
        @Inject(at = @At("HEAD"), method = "get(III)I", cancellable = true)
    private void get_1266871224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1266871224L))
            info.setReturnValue(2125469337);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_911515650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(911515650L))
            info.setReturnValue("\u71E3O\uFC80[/w,1Z_?(\uB5D2L$m'*\u123E(0E t*#$X;\uA182Cdquxs7-u1\u0D74[4");
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/DataLayer;", cancellable = true)
    private void copy__280620588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-280620588L))
            info.setReturnValue(new net.minecraft.world.level.chunk.DataLayer());
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_2085254704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085254704L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fill(I)V", cancellable = true)
    private void fill__1034074203(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1034074203L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "set(IIII)V", cancellable = true)
    private void set__633651860(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-633651860L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getData()[B", cancellable = true)
    private void getData__1062156545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062156545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDefinitelyHomogenous()Z", cancellable = true)
    private void isDefinitelyHomogenous_2085254704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085254704L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isDefinitelyFilledWith(I)Z", cancellable = true)
    private void isDefinitelyFilledWith__1034070359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034070359L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "layerToString(I)Ljava/lang/String;", cancellable = true)
    private void layerToString_626106537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(626106537L))
            info.setReturnValue("9\u4A4C!]gX\"v*DL\u4A18+Q]9;8kZ\uBD30)$ef9#r^7! u)xlui0w\u8E8DD@u4vR@\uCCBD]Sz-\u5B90\uB719J3wSc|Cz<A\uC355.E5d!1Ht");
    }


}
