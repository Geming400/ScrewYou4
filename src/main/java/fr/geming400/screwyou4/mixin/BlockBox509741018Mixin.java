package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.BlockBox.class)
public class BlockBox509741018Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__398885250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-398885250L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1280164543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1280164543L))
            info.setReturnValue("I1rxxor=\u2DE5[CU)\uC8C2xHbGST\u5494\u9924MI&\u0607FGE:B)\u7BEBjchzFD\u7936\uD4D3E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1067093109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067093109L))
            info.setReturnValue(412560684);
    }

    @Inject(at = @At("HEAD"), method = "min()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void min__1627444919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1627444919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void max__881404809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-881404809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockBox;", cancellable = true)
    private static void of_1448864487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448864487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockBox;", cancellable = true)
    private static void of__2003933243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2003933243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator_2143819816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2143819816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockBox;", cancellable = true)
    private void offset_1527775698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527775698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void contains__1744801340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1744801340L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockBox;", cancellable = true)
    private void move__2041067326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2041067326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "include(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockBox;", cancellable = true)
    private void include_1991878912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1991878912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aabb()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void aabb__640542542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-640542542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeY()I", cancellable = true)
    private void sizeY__1514321848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1514321848L))
            info.setReturnValue(627966600);
    }

    @Inject(at = @At("HEAD"), method = "sizeZ()I", cancellable = true)
    private void sizeZ__1485692697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1485692697L))
            info.setReturnValue(-400973726);
    }

    @Inject(at = @At("HEAD"), method = "sizeX()I", cancellable = true)
    private void sizeX__1542950999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542950999L))
            info.setReturnValue(1694309876);
    }

    @Inject(at = @At("HEAD"), method = "extend(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockBox;", cancellable = true)
    private void extend_659588107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659588107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBlock()Z", cancellable = true)
    private void isBlock__380426770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-380426770L))
            info.setReturnValue(false);
    }


}
