package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.food.FoodProperties.class)
public class FoodProperties_404639721Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__503986548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503986548L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1175063245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175063245L))
            info.setReturnValue("EQdK\u4040(YJ\uA1D1#\u9AEE\u4963`\uADA9!iy*x>pbfSXF+\u9832Gb\u0783,kXV;Y#:>oZ{fW}jB1ilmDux,FP");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_961991811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(961991811L))
            info.setReturnValue(-1748983851);
    }

    @Inject(at = @At("HEAD"), method = "canAlwaysEat()Z", cancellable = true)
    private void canAlwaysEat_969575526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969575526L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "saturation()F", cancellable = true)
    private void saturation__132009479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-132009479L))
            info.setReturnValue(8.150273E8F);
    }

    @Inject(at = @At("HEAD"), method = "onConsume(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/component/Consumable;)V", cancellable = true)
    private void onConsume_312542569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(312542569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nutrition()I", cancellable = true)
    private void nutrition__1678694090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1678694090L))
            info.setReturnValue(-1504732091);
    }


}
