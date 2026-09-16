package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.AllOf.ValueEffects.class)
public class ValueEffects_279854969Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__628771300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-628771300L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1050278493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050278493L))
            info.setReturnValue("DvWk");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_837207059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837207059L))
            info.setReturnValue(1095011257);
    }

    @Inject(at = @At("HEAD"), method = "process(ILnet/minecraft/util/RandomSource;F)F", cancellable = true)
    private void process__1596153831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1596153831L))
            info.setReturnValue(3.735289E8F);
    }

    @Inject(at = @At("HEAD"), method = "effects()Ljava/util/List;", cancellable = true)
    private void effects_831132074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831132074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1346300222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1346300222L))
            info.setReturnValue(null);
    }


}
