package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.RuinedPortalPiece.Properties.class)
public class Properties_1765501768Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_856875499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(856875499L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1759042004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759042004L))
            info.setReturnValue("ZWg\uC9E7_c\u851BR9zRLhaH!:QgQ^\uD00D59");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1972113438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1972113438L))
            info.setReturnValue(885973001);
    }

    @Inject(at = @At("HEAD"), method = "replaceWithBlackstone()Z", cancellable = true)
    private void replaceWithBlackstone_1234374654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234374654L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "airPocket()Z", cancellable = true)
    private void airPocket_454186366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(454186366L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "overgrown()Z", cancellable = true)
    private void overgrown_1331940087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1331940087L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mossiness()F", cancellable = true)
    private void mossiness__1001181012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1001181012L))
            info.setReturnValue(8.472586E8F);
    }

    @Inject(at = @At("HEAD"), method = "vines()Z", cancellable = true)
    private void vines_457385109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(457385109L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "cold()Z", cancellable = true)
    private void cold__933068646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-933068646L))
            info.setReturnValue(true);
    }


}
