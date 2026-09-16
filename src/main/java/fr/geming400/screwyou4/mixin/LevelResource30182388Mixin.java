package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelResource.class)
public class LevelResource30182388Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__878443880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878443880L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_800605417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(800605417L))
            info.setReturnValue("\uA667OhZ}A$(S)1bbb&&\u40D1hM");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_587534479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587534479L))
            info.setReturnValue(1351371393);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_371343960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371343960L))
            info.setReturnValue("q\uA00CL\u0B99'\u0DB9)8\u5DBDI5`88MDiJS/kp4wCb-acVH\u8B04yN\u934B5L\u2B8DmF\u6139X]uwy!U#|7;;xD\"%x{\u9C1C7_Z-\u18A1");
    }


}
