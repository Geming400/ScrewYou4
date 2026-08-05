package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.food.FoodData.class)
public class FoodData2011525310Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void tick_1241963457(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1241963457L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "eat(Lnet/minecraft/world/food/FoodProperties;)V", cancellable = true)
    private void eat_1710316791(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1710316791L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "eat(IF)V", cancellable = true)
    private void eat_1012875278(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1012875278L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSaturationLevel()F", cancellable = true)
    private void getSaturationLevel_2049784673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049784673L))
            info.setReturnValue(6.562642E8F);
    }

    @Inject(at = @At("HEAD"), method = "setSaturation(F)V", cancellable = true)
    private void setSaturation__1072295577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1072295577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFoodLevel(I)V", cancellable = true)
    private void setFoodLevel__1069525014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1069525014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFoodLevel()I", cancellable = true)
    private void getFoodLevel_2049787556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049787556L))
            info.setReturnValue(728639590);
    }

    @Inject(at = @At("HEAD"), method = "addAdditionalSaveData(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void addAdditionalSaveData_792393958(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(792393958L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readAdditionalSaveData(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void readAdditionalSaveData__2052205353(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2052205353L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addExhaustion(F)V", cancellable = true)
    private void addExhaustion__1072295577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1072295577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasEnoughFood()Z", cancellable = true)
    private void hasEnoughFood_2049803893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049803893L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "needsFood()Z", cancellable = true)
    private void needsFood_2049803893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049803893L))
            info.setReturnValue(true);
    }


}
