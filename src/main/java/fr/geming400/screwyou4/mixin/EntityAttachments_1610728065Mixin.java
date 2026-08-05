package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntityAttachments.class)
public class EntityAttachments_1610728065Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/EntityAttachment;IF)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void get_1643084108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643084108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scale(FFF)Lnet/minecraft/world/entity/EntityAttachments;", cancellable = true)
    private void scale_1817471942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1817471942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/entity/EntityAttachments$Builder;", cancellable = true)
    private static void builder__738422019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-738422019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAverage(Lnet/minecraft/world/entity/EntityAttachment;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getAverage_109487855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109487855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClamped(Lnet/minecraft/world/entity/EntityAttachment;IF)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getClamped_1643084108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643084108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefault(FF)Lnet/minecraft/world/entity/EntityAttachments;", cancellable = true)
    private static void createDefault__70870668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-70870668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNullable(Lnet/minecraft/world/entity/EntityAttachment;IF)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getNullable_1643084108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643084108L))
            info.setReturnValue(null);
    }


}
