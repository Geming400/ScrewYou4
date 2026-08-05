package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.BiomeSpecialEffects.class)
public class BiomeSpecialEffects_909290389Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2000164649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2000164649L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__226169587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226169587L))
            info.setReturnValue("y]\"\uB22Eo\uB3CBz,/@(y2|\uAE3FG;*`RTJK\uFC032pEv|\u728Et)771KA#B&C#!'PY\uB32712b&3GQ<L\u17D0[Qegw829<;6X\"!\uBA74I|,\uB322td");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_947553130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947553130L))
            info.setReturnValue(1619116473);
    }

    @Inject(at = @At("HEAD"), method = "grassColorModifier()Lnet/minecraft/world/level/biome/BiomeSpecialEffects$GrassColorModifier;", cancellable = true)
    private void grassColorModifier_1463079064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1463079064L))
            info.setReturnValue(net.minecraft.world.level.biome.BiomeSpecialEffects.GrassColorModifier.NONE);
    }

    @Inject(at = @At("HEAD"), method = "grassColorOverride()Ljava/util/Optional;", cancellable = true)
    private void grassColorOverride_1154751810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154751810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "foliageColorOverride()Ljava/util/Optional;", cancellable = true)
    private void foliageColorOverride_1154751810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154751810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dryFoliageColorOverride()Ljava/util/Optional;", cancellable = true)
    private void dryFoliageColorOverride_1154751810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154751810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waterColor()I", cancellable = true)
    private void waterColor_947552634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947552634L))
            info.setReturnValue(1823772392);
    }


}
