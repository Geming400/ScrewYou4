package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.BlockBox.class)
public class BlockBox509741018Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1895253277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1895253277L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__625718957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625718957L))
            info.setReturnValue("\u6B28\u715Djk\u3044;y8Zu\uA984!\u1365znk)\uBCFFxDn <M\u1403g&FW6x@UM=+5Ylm\u42FE$ }\u742E\u52DD\uCF0EN;@R\uB6DDw\"Ne@MJp<x9\u1CE9[P\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_548003760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548003760L))
            info.setReturnValue(-71196726);
    }

    @Inject(at = @At("HEAD"), method = "min()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void min__1383645861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1383645861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void max__1383645861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1383645861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockBox;", cancellable = true)
    private static void of_1239690236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1239690236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockBox;", cancellable = true)
    private static void of_2132577104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2132577104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1641875014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641875014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockBox;", cancellable = true)
    private void offset_1560813125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1560813125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void contains_678511461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678511461L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockBox;", cancellable = true)
    private void move_69965041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69965041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "include(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockBox;", cancellable = true)
    private void include_2132576856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2132576856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBlock()Z", cancellable = true)
    private void isBlock_548019601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548019601L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "sizeX()I", cancellable = true)
    private void sizeX_548003264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548003264L))
            info.setReturnValue(107326763);
    }

    @Inject(at = @At("HEAD"), method = "sizeZ()I", cancellable = true)
    private void sizeZ_548003264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548003264L))
            info.setReturnValue(107326763);
    }

    @Inject(at = @At("HEAD"), method = "sizeY()I", cancellable = true)
    private void sizeY_548003264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548003264L))
            info.setReturnValue(107326763);
    }

    @Inject(at = @At("HEAD"), method = "aabb()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void aabb__910916334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910916334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extend(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockBox;", cancellable = true)
    private void extend_69965041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69965041L))
            info.setReturnValue(null);
    }


}
