package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.GuiGraphicsExtractor.class)
public class GuiGraphicsExtractor_1981563336Mixin {
        @Inject(at = @At("HEAD"), method = "map(Lnet/minecraft/client/renderer/state/MapRenderState;)V", cancellable = true)
    private void map__1455373904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1455373904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fill(IIIII)V", cancellable = true)
    private void fill_513874611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(513874611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fill(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/client/gui/render/TextureSetup;IIII)V", cancellable = true)
    private void fill__702136633(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-702136633L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fill(Lcom/mojang/blaze3d/pipeline/RenderPipeline;IIIII)V", cancellable = true)
    private void fill_1980548862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1980548862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/client/gui/Font;Lnet/minecraft/util/FormattedCharSequence;III)V", cancellable = true)
    private void text_1512135194(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1512135194L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V", cancellable = true)
    private void text__862767421(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-862767421L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;III)V", cancellable = true)
    private void text__1298168229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1298168229L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/client/gui/Font;Ljava/lang/String;III)V", cancellable = true)
    private void text_129625509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(129625509L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/client/gui/Font;Ljava/lang/String;IIIZ)V", cancellable = true)
    private void text_449165497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(449165497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/client/gui/Font;Lnet/minecraft/util/FormattedCharSequence;IIIZ)V", cancellable = true)
    private void text_357292772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(357292772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item(Lnet/minecraft/world/item/ItemStack;II)V", cancellable = true)
    private void item__999345025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-999345025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item(Lnet/minecraft/world/item/ItemStack;III)V", cancellable = true)
    private void item__204882546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-204882546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;III)V", cancellable = true)
    private void item_947907806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(947907806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entity(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;FLorg/joml/Vector3fc;Lorg/joml/Quaternionfc;Lorg/joml/Quaternionfc;IIII)V", cancellable = true)
    private void entity__761467027(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-761467027L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textRenderer(Lnet/minecraft/client/gui/GuiGraphicsExtractor$HoveredTextEffects;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/ActiveTextCollector;", cancellable = true)
    private void textRenderer__340196376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-340196376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textRenderer()Lnet/minecraft/client/gui/ActiveTextCollector;", cancellable = true)
    private void textRenderer_71663903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71663903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textRenderer(Lnet/minecraft/client/gui/GuiGraphicsExtractor$HoveredTextEffects;)Lnet/minecraft/client/gui/ActiveTextCollector;", cancellable = true)
    private void textRenderer_443766796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443766796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIII)V", cancellable = true)
    private void blitSprite__2015195369(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2015195369L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIIIF)V", cancellable = true)
    private void blitSprite__1634242701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1634242701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIIII)V", cancellable = true)
    private void blitSprite__1631472138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1631472138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIIIIIIII)V", cancellable = true)
    private void blitSprite__1928892874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1928892874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;IIII)V", cancellable = true)
    private void blitSprite_367163097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(367163097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIIIIIII)V", cancellable = true)
    private void blitSprite__639316265(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-639316265L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;IIIII)V", cancellable = true)
    private void blitSprite__792803724(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-792803724L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSprite(Lnet/minecraft/client/resources/model/sprite/SpriteId;)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void getSprite__1651959573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1651959573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tooltip(Lnet/minecraft/client/gui/Font;Ljava/util/List;IILnet/minecraft/client/gui/screens/inventory/tooltip/ClientTooltipPositioner;Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void tooltip_545327619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(545327619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setComponentTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;II)V", cancellable = true)
    private void setComponentTooltipForNextFrame__1797632145(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1797632145L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setComponentTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;IILnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setComponentTooltipForNextFrame_1964070263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1964070263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextStratum()V", cancellable = true)
    private void nextStratum_2019838074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2019838074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyCursor(Lcom/mojang/blaze3d/platform/Window;)V", cancellable = true)
    private void applyCursor_1112300808(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1112300808L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textWithBackdrop(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIII)V", cancellable = true)
    private void textWithBackdrop__878467278(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-878467278L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disableScissor()V", cancellable = true)
    private void disableScissor_2019838074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2019838074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textWithWordWrap(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/FormattedText;IIIIZ)V", cancellable = true)
    private void textWithWordWrap__1021644328(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1021644328L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textWithWordWrap(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/FormattedText;IIII)V", cancellable = true)
    private void textWithWordWrap__749103962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-749103962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enableScissor(IIII)V", cancellable = true)
    private void enableScissor__699064646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-699064646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "centeredText(Lnet/minecraft/client/gui/Font;Ljava/lang/String;III)V", cancellable = true)
    private void centeredText_129625509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(129625509L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "centeredText(Lnet/minecraft/client/gui/Font;Lnet/minecraft/util/FormattedCharSequence;III)V", cancellable = true)
    private void centeredText_1512135194(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1512135194L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "centeredText(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;III)V", cancellable = true)
    private void centeredText__1298168229(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1298168229L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillGradient(IIIIII)V", cancellable = true)
    private void fillGradient__539714086(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-539714086L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blurBeforeThisStratum()V", cancellable = true)
    private void blurBeforeThisStratum_2019838074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2019838074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "verticalLine(IIII)V", cancellable = true)
    private void verticalLine__699064646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-699064646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "horizontalLine(IIII)V", cancellable = true)
    private void horizontalLine__699064646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-699064646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "itemDecorations(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;IILjava/lang/String;)V", cancellable = true)
    private void itemDecorations_214721453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(214721453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "itemDecorations(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;II)V", cancellable = true)
    private void itemDecorations_1964928995(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1964928995L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textHighlight(IIIIZ)V", cancellable = true)
    private void textHighlight_529574468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(529574468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPreeditOverlay(Lnet/minecraft/client/gui/components/Renderable;)V", cancellable = true)
    private void setPreeditOverlay_493227300(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(493227300L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;Ljava/util/Optional;II)V", cancellable = true)
    private void setTooltipForNextFrame_789085790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(789085790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;II)V", cancellable = true)
    private void setTooltipForNextFrame_1964928995(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1964928995L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Ljava/util/List;II)V", cancellable = true)
    private void setTooltipForNextFrame_1353611787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1353611787L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;II)V", cancellable = true)
    private void setTooltipForNextFrame__1797632145(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1797632145L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;II)V", cancellable = true)
    private void setTooltipForNextFrame__2004443630(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2004443630L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IILnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setTooltipForNextFrame__1458942310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1458942310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;Ljava/util/Optional;Lnet/minecraft/client/gui/screens/inventory/tooltip/ClientTooltipPositioner;IIZLnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setTooltipForNextFrame__898533604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-898533604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;Ljava/util/Optional;IILnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setTooltipForNextFrame__1846609690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1846609690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;IILnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setTooltipForNextFrame_1964070263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1964070263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/network/chat/Component;II)V", cancellable = true)
    private void setTooltipForNextFrame_1186507694(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1186507694L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;Lnet/minecraft/client/gui/screens/inventory/tooltip/ClientTooltipPositioner;IIZ)V", cancellable = true)
    private void setTooltipForNextFrame_1636375075(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1636375075L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "profilerChart(Ljava/util/List;IIII)V", cancellable = true)
    private void profilerChart_692349163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(692349163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractDeferredElements(IIF)V", cancellable = true)
    private void extractDeferredElements_1198700368(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1198700368L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bannerPattern(Lnet/minecraft/client/model/object/banner/BannerFlagModel;Lnet/minecraft/world/item/DyeColor;Lnet/minecraft/world/level/block/entity/BannerPatternLayers;IIII)V", cancellable = true)
    private void bannerPattern_1009422723(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1009422723L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blit(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIFFIIIII)V", cancellable = true)
    private void blit__243465578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-243465578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blit(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIFFIIIIIII)V", cancellable = true)
    private void blit__795673930(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-795673930L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blit(Lnet/minecraft/resources/Identifier;IIIIFFFF)V", cancellable = true)
    private void blit__462069566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-462069566L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blit(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIFFIIII)V", cancellable = true)
    private void blit_1077620343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1077620343L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blit(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIFFIIIIII)V", cancellable = true)
    private void blit_1752543831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1752543831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blit(Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;IIIIFFFF)V", cancellable = true)
    private void blit_1837176816(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1837176816L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "guiWidth()I", cancellable = true)
    private void guiWidth_2019825581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2019825581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "guiHeight()I", cancellable = true)
    private void guiHeight_2019825581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2019825581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outline(IIIII)V", cancellable = true)
    private void outline_513874611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(513874611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fakeItem(Lnet/minecraft/world/item/ItemStack;II)V", cancellable = true)
    private void fakeItem__999345025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-999345025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fakeItem(Lnet/minecraft/world/item/ItemStack;III)V", cancellable = true)
    private void fakeItem__204882546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-204882546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "book(Lnet/minecraft/client/model/object/book/BookModel;Lnet/minecraft/resources/Identifier;FFFIIII)V", cancellable = true)
    private void book__1838348019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1838348019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2fStack;", cancellable = true)
    private void pose_2079126375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2079126375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skin(Lnet/minecraft/client/model/Model$Simple;Lnet/minecraft/resources/Identifier;FFFFIIII)V", cancellable = true)
    private void skin_751994358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(751994358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textRendererForWidget(Lnet/minecraft/client/gui/components/AbstractWidget;Lnet/minecraft/client/gui/GuiGraphicsExtractor$HoveredTextEffects;)Lnet/minecraft/client/gui/ActiveTextCollector;", cancellable = true)
    private void textRendererForWidget_1546237880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1546237880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requestCursor(Lcom/mojang/blaze3d/platform/cursor/CursorType;)V", cancellable = true)
    private void requestCursor_274168729(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(274168729L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "containsPointInScissor(II)Z", cancellable = true)
    private void containsPointInScissor_985687710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(985687710L))
            info.setReturnValue(null);
    }


}
