package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.Type.class)
public class Type712954010Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__195672258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-195672258L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1483377535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1483377535L))
            info.setReturnValue("\u7031JF3\".Q:K\u7147JG\u7626uDIix3H8U$h\u5C2A4\u8193XCCqH7Cn2hh+Ro(vk9<,{R\uD759.]yiK\u92A7'\u5344sy\u2687D\u0236l\uA166T=\u6D3B9(6/-\u112F}W\u0F8B\u825F\uCF5D<E\"'CwF0P6HM{F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1270306101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270306101L))
            info.setReturnValue(-1113121768);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1779399264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779399264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec__425792096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-425792096L))
            info.setReturnValue(null);
    }


}
