package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.data.BlockDataSource.class)
public class BlockDataSource1451951860Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1457503177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457503177L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_316491885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(316491885L))
            info.setReturnValue("E_띭6 ojrr>x?sjUn");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1490214602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1490214602L))
            info.setReturnValue(-254539112);
    }

    @Inject(at = @At("HEAD"), method = "coordinates()Lnet/minecraft/util/CompilableString;", cancellable = true)
    private void coordinates_1286495522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286495522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getData(Lnet/minecraft/commands/CommandSourceStack;)Ljava/util/stream/Stream;", cancellable = true)
    private void getData_1541335467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1541335467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1107161712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107161712L))
            info.setReturnValue(null);
    }


}
