package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.BiomeSpecialEffects.class)
public class BiomeSpecialEffects_909290389Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_664120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(664120L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1679713913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679713913L))
            info.setReturnValue("C(sfI(I6zKi4G\u9F55HA{a\uCE56|R!>}\u6DFFpv5+;yEo[U%Cj;PdGY\u2E4EKXPYz\u7011rK^5Js_mY'ZFQH");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1466642479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466642479L))
            info.setReturnValue(-122402379);
    }

    @Inject(at = @At("HEAD"), method = "grassColorOverride()Ljava/util/Optional;", cancellable = true)
    private void grassColorOverride_1368212603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1368212603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "grassColorModifier()Lnet/minecraft/world/level/biome/BiomeSpecialEffects$GrassColorModifier;", cancellable = true)
    private void grassColorModifier__1857563684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857563684L))
            info.setReturnValue(net.minecraft.world.level.biome.BiomeSpecialEffects.GrassColorModifier.DARK_FOREST);
    }

    @Inject(at = @At("HEAD"), method = "foliageColorOverride()Ljava/util/Optional;", cancellable = true)
    private void foliageColorOverride__672750376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-672750376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dryFoliageColorOverride()Ljava/util/Optional;", cancellable = true)
    private void dryFoliageColorOverride_189360675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189360675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterColor()I", cancellable = true)
    private void waterColor__1156650898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156650898L))
            info.setReturnValue(1749571942);
    }


}
