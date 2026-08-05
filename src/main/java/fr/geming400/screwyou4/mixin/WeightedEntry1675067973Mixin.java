package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.ShufflingList.WeightedEntry.class)
public class WeightedEntry1675067973Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_539607502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(539607502L))
            info.setReturnValue("/JF=^0Z릇 扄e篱Z#V錸%v6昛v4{䗊ᝉ]\\"..po♏cIfx(eouss4wIP㊂e!QロJ'X>o*XWJ[t11SK_EAAhm깸\"*-+J3丒hZங1y56+");
    }

    @Inject(at = @At("HEAD"), method = "getData()Ljava/lang/Object;", cancellable = true)
    private void getData__760707104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760707104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__2136221348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2136221348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWeight()I", cancellable = true)
    private void getWeight_1713330219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1713330219L))
            info.setReturnValue(-469077762);
    }


}
