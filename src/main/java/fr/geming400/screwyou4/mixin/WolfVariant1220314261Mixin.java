package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.wolf.WolfVariant.class)
public class WolfVariant1220314261Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_311687993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(311687993L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1990737786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990737786L))
            info.setReturnValue("{\uFF37> Ybm q+EGMhaQ_J#q}^P%\uC496h-{/J)/\u3E75xRDfmJ[7QHu{N3[ jI5E2Fosru<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1777666352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1777666352L))
            info.setReturnValue(1443609480);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions__1208678964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1208678964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors_790640953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(790640953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babyInfo()Lnet/minecraft/world/entity/animal/wolf/WolfVariant$AssetInfo;", cancellable = true)
    private void babyInfo_1280583935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1280583935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adultInfo()Lnet/minecraft/world/entity/animal/wolf/WolfVariant$AssetInfo;", cancellable = true)
    private void adultInfo_1244850915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1244850915L))
            info.setReturnValue(null);
    }


}
