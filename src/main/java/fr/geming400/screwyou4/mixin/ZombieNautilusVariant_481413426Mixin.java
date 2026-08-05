package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.nautilus.ZombieNautilusVariant.class)
public class ZombieNautilusVariant_481413426Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1866925684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866925684L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__654046550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-654046550L))
            info.setReturnValue("\"R8'Rg\"P1/k>v\u2601QsqDZ( @c]G&slQI\u4613WN<fb\u9BD57=xv\u2360=Z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_519676167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519676167L))
            info.setReturnValue(704403616);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions__425248421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-425248421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelAndTexture()Lnet/minecraft/world/entity/variant/ModelAndTexture;", cancellable = true)
    private void modelAndTexture_1310141495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1310141495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors_2107750241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107750241L))
            info.setReturnValue(null);
    }


}
