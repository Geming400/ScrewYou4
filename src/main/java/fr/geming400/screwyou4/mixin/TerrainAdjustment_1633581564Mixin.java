package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.TerrainAdjustment.class)
public class TerrainAdjustment_1633581564Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/TerrainAdjustment;", cancellable = true)
    private static void values_876848697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876848697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/TerrainAdjustment;", cancellable = true)
    private static void valueOf__1837155904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1837155904L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.TerrainAdjustment.BEARD_THIN);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1721790185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721790185L))
            info.setReturnValue("Ex9p{`D\u3311IftbDZ.%lQ\u928E\u893C8e\u352A<z\u5ECD\uC4BE7TTDEX\u8E4BV;{}X&f^\u5AD0n\u3393CwjB");
    }


}
