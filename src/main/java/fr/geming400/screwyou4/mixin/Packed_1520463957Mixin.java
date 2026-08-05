package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiSection.Packed.class)
public class Packed_1520463957Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1388991081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388991081L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_385003981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(385003981L))
            info.setReturnValue("V_K&e\u7699t$6\uABBB<cM28W)`36KlEf\uD3254E\u49ACZ`[p4#883v1w!A\u3EE2( *W\uAEFAq\u3CF2^1D\uA350f-CT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1558726698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558726698L))
            info.setReturnValue(1614368873);
    }

    @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid_1558742539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558742539L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "records()Ljava/util/List;", cancellable = true)
    private void records__1148166524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148166524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Ljava/lang/Runnable;)Lnet/minecraft/world/entity/ai/village/poi/PoiSection;", cancellable = true)
    private void unpack_1036729365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036729365L))
            info.setReturnValue(null);
    }


}
