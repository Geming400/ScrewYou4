package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.StructureCheck.class)
public class StructureCheck_446083581Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__462542688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462542688L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1216507105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1216507105L))
            info.setReturnValue("@D sWq4+YKM<I7\u6E95i?ij[H/piZ}+\u4885*_S<4hvBL?\u184C$]ow\uA034\uAF3EHY#m28\uB5CDe-\u77FC\u471Et={ h3X}wbmP3\"\u99E4$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1003435671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1003435671L))
            info.setReturnValue(-1158489980);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1290888131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1290888131L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/entity/variant/SpawnContext;)Z", cancellable = true)
    private void test_1228668067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228668067L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "requiredStructures()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void requiredStructures_1310567983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1310567983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1512528834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512528834L))
            info.setReturnValue(null);
    }


}
