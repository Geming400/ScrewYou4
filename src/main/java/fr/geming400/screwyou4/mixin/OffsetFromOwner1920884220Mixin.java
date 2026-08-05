package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ItemOwner.OffsetFromOwner.class)
public class OffsetFromOwner1920884220Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__988570817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-988570817L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_785424245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(785424245L))
            info.setReturnValue("aQ$}%[\u958B9W+p0o^A<N3#yELNDNC)QH%y#*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1959146962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959146962L))
            info.setReturnValue(1399235413);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position__1276353547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1276353547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void offset__1276353547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1276353547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "owner()Lnet/minecraft/world/entity/ItemOwner;", cancellable = true)
    private void owner_1848014405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848014405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/Level;", cancellable = true)
    private void level__655383848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-655383848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVisualRotationYInDegrees()F", cancellable = true)
    private void getVisualRotationYInDegrees_1959143583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959143583L))
            info.setReturnValue(3.400578E8F);
    }

    @Inject(at = @At("HEAD"), method = "asLivingEntity()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void asLivingEntity_1188646105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1188646105L))
            info.setReturnValue(null);
    }


}
