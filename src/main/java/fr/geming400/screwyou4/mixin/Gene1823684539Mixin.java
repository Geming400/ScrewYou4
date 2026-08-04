package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.panda.Panda.Gene.class)
public class Gene1823684539Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private static void values__882643538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-882643538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private static void valueOf_995391403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995391403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1861946785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861946785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private static void getRandom_629926485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629926485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_688224068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688224068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private static void byId__541744420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-541744420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRecessive()Z", cancellable = true)
    private void isRecessive_1861963122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861963122L))
            info.setReturnValue(null);
    }


}
