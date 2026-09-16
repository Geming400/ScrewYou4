package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.food.FoodData.class)
public class FoodData2011525310Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void tick_230744734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(230744734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "needsFood()Z", cancellable = true)
    private void needsFood__1067009350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1067009350L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "readAdditionalSaveData(Lnet/minecraft/world/level/storage/ValueInput;)V", cancellable = true)
    private void readAdditionalSaveData_169694739(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(169694739L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addAdditionalSaveData(Lnet/minecraft/world/level/storage/ValueOutput;)V", cancellable = true)
    private void addAdditionalSaveData__585289227(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-585289227L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addExhaustion(F)V", cancellable = true)
    private void addExhaustion__1279543226(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1279543226L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasEnoughFood()Z", cancellable = true)
    private void hasEnoughFood__999237811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-999237811L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setFoodLevel(I)V", cancellable = true)
    private void setFoodLevel_1034256494(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1034256494L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSaturation(F)V", cancellable = true)
    private void setSaturation__442342341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-442342341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFoodLevel()I", cancellable = true)
    private void getFoodLevel__821521004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821521004L))
            info.setReturnValue(-1931526225);
    }

    @Inject(at = @At("HEAD"), method = "getSaturationLevel()F", cancellable = true)
    private void getSaturationLevel__1940805563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1940805563L))
            info.setReturnValue(7.18627E7F);
    }

    @Inject(at = @At("HEAD"), method = "eat(IF)V", cancellable = true)
    private void eat__582007370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-582007370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "eat(Lnet/minecraft/world/food/FoodProperties;)V", cancellable = true)
    private void eat_1482410575(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1482410575L))
            info.cancel();
    }


}
