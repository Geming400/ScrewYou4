package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.Markings.class)
public class Markings1834146116Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/equine/Markings;", cancellable = true)
    private static void values__1394092085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1394092085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/equine/Markings;", cancellable = true)
    private static void valueOf_962598116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962598116L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Markings.BLACK_DOTS);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_175822521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(175822521L))
            info.setReturnValue(1925308269);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/equine/Markings;", cancellable = true)
    private static void byId_735097741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735097741L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Markings.BLACK_DOTS);
    }


}
