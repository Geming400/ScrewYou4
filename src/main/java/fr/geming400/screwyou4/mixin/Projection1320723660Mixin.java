package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool.Projection.class)
public class Projection1320723660Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_185263189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185263189L))
            info.setReturnValue("l껙{'珳^uu遲2Txt왆2H,つJ5崲tVyv{aꋭ쳠l7뙞<;7Ց'.=\"%|Yoh@z5AN*{tRVKZᑄzn閼Z:pki6^ExT+:P혲䕑'gg唈FងeyCu$Pﮋ愄z叄");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool$Projection;", cancellable = true)
    private static void values_56442314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(56442314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool$Projection;", cancellable = true)
    private static void valueOf__1178163347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1178163347L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool.Projection.RIGID);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool$Projection;", cancellable = true)
    private static void byName__1178163347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1178163347L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool.Projection.RIGID);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_185263189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185263189L))
            info.setReturnValue("l껙{'珳^uu遲2Txt왆2H,つJ5崲tVyv{aꋭ쳠l7뙞<;7Ց'.=\"%|Yoh@z5AN*{tRVKZᑄzn閼Z:pki6^ExT+:P혲䕑'gg唈FងeyCu$Pﮋ愄z叄");
    }

    @Inject(at = @At("HEAD"), method = "getProcessors()Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private void getProcessors__2006465103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006465103L))
            info.setReturnValue(null);
    }


}
