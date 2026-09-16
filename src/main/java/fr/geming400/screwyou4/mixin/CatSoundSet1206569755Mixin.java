package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.feline.CatSoundVariant.CatSoundSet.class)
public class CatSoundSet1206569755Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_297943487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(297943487L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1976993280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976993280L))
            info.setReturnValue("(Ft,S1\u3CECYw2yZh8qc#&!pk`\u7851\u7225(!g90JrFr<s\u0419I@l(GI3w\uA028c$y\u0A5A|Y\u4E0F=S \u2D34,0|z\uAAEDuoC\u4F66b]\u614F(Tj 2oL6bjgx2hFA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1763921846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763921846L))
            info.setReturnValue(658983814);
    }

    @Inject(at = @At("HEAD"), method = "hurtSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hurtSound__1573389097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573389097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deathSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void deathSound__1373440836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1373440836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eatSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void eatSound_931284896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931284896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "purrSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void purrSound_869784781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869784781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hissSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hissSound__2083049751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083049751L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strayAmbientSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void strayAmbientSound__1773807369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1773807369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void ambientSound__1120988448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120988448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "purreowSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void purreowSound__578258896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578258896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "begForFoodSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void begForFoodSound__299108757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-299108757L))
            info.setReturnValue(null);
    }


}
