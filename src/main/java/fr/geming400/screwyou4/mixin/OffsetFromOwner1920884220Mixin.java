package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ItemOwner.OffsetFromOwner.class)
public class OffsetFromOwner1920884220Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1012257952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012257952L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1603659551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1603659551L))
            info.setReturnValue("gfiV*9B!PK\uC8B4e+9)K^9s_s`'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1816730985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1816730985L))
            info.setReturnValue(1864353100);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position__1796525524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1796525524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void offset__1616388478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616388478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "owner()Lnet/minecraft/world/entity/ItemOwner;", cancellable = true)
    private void owner_70015288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(70015288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void level__153376300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153376300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asLivingEntity()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void asLivingEntity__474848165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-474848165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVisualRotationYInDegrees()F", cancellable = true)
    private void getVisualRotationYInDegrees__1768521214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1768521214L))
            info.setReturnValue(4.004626E8F);
    }


}
