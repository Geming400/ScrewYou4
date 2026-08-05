package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.Type.class)
public class Type712954010Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2098466269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098466269L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__422505965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-422505965L))
            info.setReturnValue("n>\u8693\uBB10./}w{@j{ep\u8A78\")0el)\u5463@m5jw5\u80591-!c\u46BF;wK}\u4A05M\u668ADzG64M\u80D9yFC\"\uBF27#Z_6koB3fiN>n$H)22#A4U?6T]`&3a5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_751216752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(751216752L))
            info.setReturnValue(-638025083);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1846159562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846159562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec_1973954134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1973954134L))
            info.setReturnValue(null);
    }


}
