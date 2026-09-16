package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.chicken.ChickenVariant.class)
public class ChickenVariant_211196210Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__697430059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697430059L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_981619734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(981619734L))
            info.setReturnValue("\u838FYo\"6-L6?9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_768548300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768548300L))
            info.setReturnValue(-1084525744);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions_2077170280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077170280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babyTexture()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void babyTexture__561789134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-561789134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelAndTexture()Lnet/minecraft/world/entity/variant/ModelAndTexture;", cancellable = true)
    private void modelAndTexture__827986812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-827986812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors__218477099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-218477099L))
            info.setReturnValue(null);
    }


}
