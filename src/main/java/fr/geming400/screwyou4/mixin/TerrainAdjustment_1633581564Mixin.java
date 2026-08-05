package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.TerrainAdjustment.class)
public class TerrainAdjustment_1633581564Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/TerrainAdjustment;", cancellable = true)
    private static void values__1426436581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1426436581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/TerrainAdjustment;", cancellable = true)
    private static void valueOf__1998404456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1998404456L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.TerrainAdjustment.ENCAPSULATE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_498121092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498121092L))
            info.setReturnValue("=/bBv}Wzb5jNl츾E6㩞駨");
    }


}
