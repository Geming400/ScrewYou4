package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.Dye.class)
public class Dye214886898Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1180363756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1180363756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__693739370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693739370L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_985310423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(985310423L))
            info.setReturnValue("t(w=\u6D19!Fs(zic/\u9EB4Q/p8TAm)<u/\u833C|/h s\uAC06l\uBD30Iq>\u56AByU\u2655>;G\u3175qNaS[\uB313^\u4F2E:q#S4-^k\u3F6EUL5\u4A83?\uB2AFG ,aRJ_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_772238989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(772238989L))
            info.setReturnValue(1644916110);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate__1005518386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1005518386L))
            info.setReturnValue(1270435400);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor_1764248438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1764248438L))
            info.setReturnValue(-2124824845);
    }


}
