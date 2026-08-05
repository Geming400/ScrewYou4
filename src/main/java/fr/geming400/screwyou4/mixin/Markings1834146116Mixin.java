package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.Markings.class)
public class Markings1834146116Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/equine/Markings;", cancellable = true)
    private static void values_164890793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164890793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/equine/Markings;", cancellable = true)
    private static void valueOf__1160000756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1160000756L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Markings.WHITE_DOTS);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1872408362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1872408362L))
            info.setReturnValue(-1034532686);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/equine/Markings;", cancellable = true)
    private static void byId_452982203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452982203L))
            info.setReturnValue(net.minecraft.world.entity.animal.equine.Markings.WHITE_FIELD);
    }


}
