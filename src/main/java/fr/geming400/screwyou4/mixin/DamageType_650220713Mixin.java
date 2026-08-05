package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.DamageType.class)
public class DamageType_650220713Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2035732971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2035732971L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__485239263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-485239263L))
            info.setReturnValue("ꢽ,볿84C;h>,넵@{wgmV歰g?+^VFu_k'+䫥|D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_688483454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688483454L))
            info.setReturnValue(-1144931772);
    }

    @Inject(at = @At("HEAD"), method = "msgId()Ljava/lang/String;", cancellable = true)
    private void msgId__485239759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-485239759L))
            info.setReturnValue("諃p亟F<ml 툹顴[Rg$xzHQ'<9S꾜t螅`DYBT+);ne-\"|PX");
    }

    @Inject(at = @At("HEAD"), method = "scaling()Lnet/minecraft/world/damagesource/DamageScaling;", cancellable = true)
    private void scaling_1205729202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205729202L))
            info.setReturnValue(net.minecraft.world.damagesource.DamageScaling.NEVER);
    }

    @Inject(at = @At("HEAD"), method = "effects()Lnet/minecraft/world/damagesource/DamageEffects;", cancellable = true)
    private void effects_870204503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870204503L))
            info.setReturnValue(net.minecraft.world.damagesource.DamageEffects.FREEZING);
    }

    @Inject(at = @At("HEAD"), method = "deathMessageType()Lnet/minecraft/world/damagesource/DeathMessageType;", cancellable = true)
    private void deathMessageType_977619179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(977619179L))
            info.setReturnValue(net.minecraft.world.damagesource.DeathMessageType.FALL_VARIANTS);
    }

    @Inject(at = @At("HEAD"), method = "exhaustion()F", cancellable = true)
    private void exhaustion_688480075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688480075L))
            info.setReturnValue(3.496627E8F);
    }


}
