package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.panda.Panda.Gene.class)
public class Gene1823684539Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private static void values__1966472500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966472500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private static void valueOf__1923520301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923520301L))
            info.setReturnValue(net.minecraft.world.entity.animal.panda.Panda.Gene.LAZY);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_165360944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165360944L))
            info.setReturnValue(1823992014);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private static void getRandom__1901192004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1901192004L))
            info.setReturnValue(net.minecraft.world.entity.animal.panda.Panda.Gene.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/panda/Panda$Gene;", cancellable = true)
    private static void byId__386097334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386097334L))
            info.setReturnValue(net.minecraft.world.entity.animal.panda.Panda.Gene.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1911893161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911893161L))
            info.setReturnValue("*.7\u7AFDMt=Y94F/+f8\u042FT&noCUy/s0Xq?\u7C06\u46D0z@0_>*V7h\u0FC0\uD16DJb!\uACEEeo\uAB70\u5B64/yaDCXqg");
    }

    @Inject(at = @At("HEAD"), method = "isRecessive()Z", cancellable = true)
    private void isRecessive_2107213145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107213145L))
            info.setReturnValue(false);
    }


}
