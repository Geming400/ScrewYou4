package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.frog.FrogVariant.class)
public class FrogVariant503710275Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__404915993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-404915993L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1274133800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274133800L))
            info.setReturnValue("_lpfEx._m\u7C2B.\u23C6>;{\u1D00wZbF<&-d\u24CFkV\u829A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1061062366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1061062366L))
            info.setReturnValue(-764562497);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions__1925282950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1925282950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors_74036967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(74036967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assetInfo()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void assetInfo_236209693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236209693L))
            info.setReturnValue(null);
    }


}
