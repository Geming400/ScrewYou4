package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.BlocksAttacks.ItemDamageFunction.class)
public class ItemDamageFunction2089842207Mixin {
        @Inject(at = @At("HEAD"), method = "base()F", cancellable = true)
    private void base_220386449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(220386449L))
            info.setReturnValue(3.655905E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1181215939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1181215939L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1434701564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434701564L))
            info.setReturnValue("\u4982S4^zXv*s\u1DF4]E(Q{u\uD12Fq}\u5DCBqNJA@C`\u1313uT sk}\uF939Zp:X 7H");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1647772998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1647772998L))
            info.setReturnValue(-1304769287);
    }

    @Inject(at = @At("HEAD"), method = "apply(F)I", cancellable = true)
    private void apply__1052008727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052008727L))
            info.setReturnValue(-1891418432);
    }

    @Inject(at = @At("HEAD"), method = "threshold()F", cancellable = true)
    private void threshold__417634505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417634505L))
            info.setReturnValue(3.665911E8F);
    }

    @Inject(at = @At("HEAD"), method = "factor()F", cancellable = true)
    private void factor_2091303123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091303123L))
            info.setReturnValue(3.665911E8F);
    }


}
