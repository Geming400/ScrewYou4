package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.frog.FrogVariant.class)
public class FrogVariant503710275Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1889222534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889222534L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__631749700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-631749700L))
            info.setReturnValue("鶧}婔rdO(hOmlwᯇ#뿠0NI!靪{yIY튭}⸎ZW?X:cJ颱yJ?ᶜ沜(DL+vwBu%sx٭jp}p_%[C[}쨰+p\"䐱{2}m}ᆝdrk|r!0訹");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_541973017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541973017L))
            info.setReturnValue(1090712518);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions__402951571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-402951571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors_2130047091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130047091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assetInfo()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void assetInfo__748470945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748470945L))
            info.setReturnValue(null);
    }


}
