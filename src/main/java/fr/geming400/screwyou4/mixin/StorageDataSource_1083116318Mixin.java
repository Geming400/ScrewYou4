package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.data.StorageDataSource.class)
public class StorageDataSource_1083116318Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_174490049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(174490049L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1853539346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1853539346L))
            info.setReturnValue("-/L4!)Glyj&6^=QHC` |;O}1<NpT:L\u670Dq_y+lpB\u2656q6sW\u899F%g+\uA3E1?u'vJx\u6807_o\uAE1ARsX_?\u899B<bLC]NZ_f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1640468408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1640468408L))
            info.setReturnValue(898251605);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1509661569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1509661569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getData(Lnet/minecraft/commands/CommandSourceStack;)Ljava/util/stream/Stream;", cancellable = true)
    private void getData__330947084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330947084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2145405725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2145405725L))
            info.setReturnValue(null);
    }


}
